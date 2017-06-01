#!ipxe

:menu
menu Please choose an option
item debian Debian
item centos Centos
item ubuntu Ubuntu
item tinycore Tinycore
item gparted Gparted
item shell	Open a shell and debug from there
choose distro && goto ${distro}

:shell
shell

:debian
menu Please choose a release
item menu (back)
item debian-stable Debian Stable
item debian-testing Debian Testing
choose release && goto ${release}

:debian-stable
kernel http://httpredir.debian.org/debian/dists/stable/main/installer-amd64/current/images/netboot/debian-installer/amd64/linux
initrd http://httpredir.debian.org/debian/dists/stable/main/installer-amd64/current/images/netboot/debian-installer/amd64/initrd.gz
boot

:debian-testing
kernel http://httpredir.debian.org/debian/dists/testing/main/installer-amd64/current/images/netboot/debian-installer/amd64/linux
initrd http://httpredir.debian.org/debian/dists/testing/main/installer-amd64/current/images/netboot/debian-installer/amd64/initrd.gz
boot


:centos
menu Please choose a release
item menu (back)
item centos-7 7 Latest
item centos-6 6
choose release && goto ${release}

:centos-7
kernel http://buildlogs.centos.org/centos/7/os/x86_64-latest/images/pxeboot/vmlinuz
initrd http://buildlogs.centos.org/centos/7/os/x86_64-latest/images/pxeboot/initrd.img
boot

:centos-6
kernel http://www.gtlib.gatech.edu/pub/centos/6/os/x86_64/images/pxeboot/vmlinuz
initrd http://www.gtlib.gatech.edu/pub/centos/6/os/x86_64/images/pxeboot/initrd.img
boot


:ubuntu
menu Please choose a release
item menu (back)
item ubuntu-trusty Trusty Tahr 14.04 LTS
item ubuntu-vivid Vivid Vervet 15.04
item ubuntu-wily Wily Werewolf 15.10
item ubuntu-xenial Xenial Xerus 16.04 LTS
item ubuntu-yakkety Yakkety Yak 16.10
item ubuntu-zesty Zesty Zapus 17.04
item ubuntu-artful Artful Aardvark 17.10
choose release && goto ${release}

:ubuntu-trusty
kernel http://us.archive.ubuntu.com/ubuntu/dists/trusty/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/trusty/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-vivid
kernel http://us.archive.ubuntu.com/ubuntu/dists/vivid/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/vivid/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-wily
kernel http://us.archive.ubuntu.com/ubuntu/dists/wily/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/wily/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-yakkety
kernel http://us.archive.ubuntu.com/ubuntu/dists/yakkety/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/yakkety/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-zesty
kernel http://us.archive.ubuntu.com/ubuntu/dists/zesty/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/zesty/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-artful
kernel http://us.archive.ubuntu.com/ubuntu/dists/artful/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/artful/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot


:tinycore
kernel memdisk
initrd http://www.tinycorelinux.net/8.x/x86/release/TinyCore-current.iso
boot

:gparted
kernel memdisk
initrd https://downloads.sourceforge.net/project/gparted/gparted-live-stable/0.28.1-1/gparted-live-0.28.1-1-amd64.iso
boot
