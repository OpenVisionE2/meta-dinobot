SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "dinobot4kmini"

SRCDATE = "20181123"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u53-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "bfb16cb778d4edc12cd817d2e20ec2e2"
SRC_URI[sha256sum] = "6d7a6b2236c67f9d58e70c4bfd0b3c99ba65c612f58ba089bbf0fca8a8c82642"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
