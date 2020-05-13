#!ipxe

:menu
menu Please choose an option
item debian Debian
item centos Centos
item ubuntu Ubuntu
item tinycore Tinycore
item gparted Gparted
item pcd PCD
item shell	Open a shell and debug from there
item reboot Reboot
choose --default reboot --timeout 300000 distro && goto ${distro}

:reboot
reboot

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
item ubuntu-xenial Xenial Xerus 16.04 LTS
item ubuntu-bionic Bionic Beaver 18.04 LTS
item ubuntu-eoan Eoan Ermine 19.10
item ubuntu-focal Focal Fossa 20.04 LTS
choose release && goto ${release}

:ubuntu-trusty
kernel http://us.archive.ubuntu.com/ubuntu/dists/trusty/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/trusty/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-xenial
kernel http://us.archive.ubuntu.com/ubuntu/dists/xenial/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/xenial/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-bionic
kernel http://us.archive.ubuntu.com/ubuntu/dists/bionic/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/bionic/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-eoan
kernel http://us.archive.ubuntu.com/ubuntu/dists/eoan/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/eoan/main/installer-amd64/current/images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:ubuntu-focal
kernel http://us.archive.ubuntu.com/ubuntu/dists/focal/main/installer-amd64/current/legacy-images/netboot/ubuntu-installer/amd64/linux
initrd http://us.archive.ubuntu.com/ubuntu/dists/focal/main/installer-amd64/current/legacy-images/netboot/ubuntu-installer/amd64/initrd.gz
boot

:tinycore
kernel memdisk
initrd http://www.tinycorelinux.net/8.x/x86/release/TinyCore-current.iso
boot

:gparted
kernel memdisk
initrd https://downloads.sourceforge.net/project/gparted/gparted-live-stable/0.28.1-1/gparted-live-0.28.1-1-amd64.iso
boot

:pcd
kernel https://github.com/brimstone/pcd/releases/download/0.18.0/pcd-0.18.0.vmlinuz
boot
