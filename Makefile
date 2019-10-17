bin/brimstone.iso bin/brimstone.lkrn: github.ipxe ipxe.patch ca.pem
	cd ipxe/src \
	&& patch -p2 < ../../ipxe.patch \
	&& make CERT=../../ca.pem \
		TRUST=../../ca.pem \
		EMBED=../../github.ipxe \
		bin/ipxe.lkrn bin/ipxe.iso bin-x86_64-efi/ipxe.efi \
	&& cp bin/ipxe.iso  ../../bin/brimstone.iso \
	&& cp bin/ipxe.lkrn ../../bin/brimstone.lkrn \
	&& cp bin-x86_64-efi/ipxe.efi  ../../bin/brimstone.efi \
	&& patch -p2 -R < ../../ipxe.patch

.PHONY: clean
clean:
	-rm ca.pem
	-rm DigiCertSHA2HighAssuranceServerCA.pem
	-rm gn.pem

.PHONY: kvm
kvm:
	kvm -cdrom bin/brimstone.iso -m 512

ca.pem: gn.pem DigiCertSHA2HighAssuranceServerCA.pem
	cat DigiCertSHA2HighAssuranceServerCA.pem > ca.pem
	cat gn.pem >> ca.pem

gn.pem:
	curl http://gn.symcb.com/gn.crt \
	| openssl x509 -inform der -out gn.pem

DigiCertSHA2HighAssuranceServerCA.pem:
	curl http://cacerts.digicert.com/DigiCertSHA2HighAssuranceServerCA.crt \
	| openssl x509 -inform der -out DigiCertSHA2HighAssuranceServerCA.pem
