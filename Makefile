ipxe/src/bin/ipxe.lkrn:
	cd ipxe/src \
	&& patch -p0 ipxe.patch \
	&& make bin/ipxe.lkrn EMBED=../../github.ipxe
