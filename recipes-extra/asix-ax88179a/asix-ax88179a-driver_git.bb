DESCRIPTION = "ASIX AX88179A out-of-tree kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRCREV = "780c5015b854785718c3d55b4b915853336bc528"
BRANCH = "main"

SRC_URI = "git://github.com/tony467913/asix-ax88179-driver.git;protocol=https;branch=${BRANCH}"

S = "${WORKDIR}/git"

RPROVIDES:${PN} += "kernel-module-ax88179a"
KERNEL_MODULE_AUTOLOAD += "ax88179a"

# Skip license QA temporarily
INSANE_SKIP:${PN} += "license"
