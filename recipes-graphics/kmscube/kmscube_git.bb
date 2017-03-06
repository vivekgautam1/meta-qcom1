DESCRIPTION = "Demo application to showcase 3D graphics using kms and gbm"
HOMEPAGE = "https://github.com/robclark/kmscube.git"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=2a12bf7a66f5f663d75186bf01eb607b"

DEPENDS = "virtual/libgles2 virtual/egl libdrm ffmpeg"

inherit autotools pkgconfig

SRCREV = "${AUTOREV}"

PV = "0.0+${SRCPV}"

SRC_URI = "git://github.com/robclark/kmscube.git;branch=v4l2-video;protocol=git"

S = "${WORKDIR}/git"
