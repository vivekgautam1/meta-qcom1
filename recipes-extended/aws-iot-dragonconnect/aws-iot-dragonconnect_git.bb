# Copyright (C) 2015 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "AWS IoT DragonConnect application"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://DragonBoard/src/LICENSE;md5=ed85eba7edec076e4a49e6ee38b0e981"

DEPENDS = "glib-2.0 openssl"

SRCREV = "1b0cb9fbf287311b435f9e06413abf88a0590130"
PV = "0.0.1+git${SRCREV}"

SRC_URI = "git://github.com/ArrowElectronics/aws-iot-dragonconnect-c.git;protocol=https"

SRC_URI += " \
	file://0001-led.c-user-LEDS-have-been-renamed.patch \
	file://0002-Makefile-do-not-hardcode-CC-to-gcc-be-nice-for-cross.patch \
	file://0003-Makefile-do-not-hardcode-any-system-path-relies-on-p.patch \
	file://0004-Makefile-ensure-.-bin-folder-exists-before-it-is-nee.patch \
	file://0005-Makefile-remove-suspicious-tabs.patch \
	file://0006-GetMachineID-use-etc-machine-id-not-dbus.patch \
"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "iftop"

do_compile_prepend() {
    cd DragonBoard
}

do_install() {
    install -d ${D}${bindir}/
    install -m 0755 ${B}/DragonBoard/bin/aws_demo ${D}${bindir}/
}

