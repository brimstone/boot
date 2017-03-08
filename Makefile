ipxe/src/bin/ipxe.lkrn:
	cd ipxe/src \
	&& patch -p0 ipxe.patch \
	&& make CERT=../../github.crt \
		TRUST=../../github.crt \
		EMBED=../../github.ipxe \
		bin/ipxe.lkrn bin/ipxe.iso
