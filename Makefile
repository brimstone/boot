bin/brimstone.iso bin/brimstone.lkrn: github.ipxe ipxe.patch
	cd ipxe/src \
	&& patch -p2 < ../../ipxe.patch \
	&& make CERT=../../DigiCertSHA2HighAssuranceServerCA.pem \
		TRUST=../../DigiCertSHA2HighAssuranceServerCA.pem \
		EMBED=../../github.ipxe \
		bin/ipxe.lkrn bin/ipxe.iso \
	&& cp bin/ipxe.iso ../../bin/brimstone.iso \
	&& cp bin/ipxe.lkrn ../../bin/brimstone.lkrn \
	&& patch -p2 -R < ../../ipxe.patch

.PHONY: kvm
kvm:
	kvm -cdrom bin/brimstone.iso -m 512
