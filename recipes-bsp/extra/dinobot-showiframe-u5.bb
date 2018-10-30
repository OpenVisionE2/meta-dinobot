SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "anadol4k|dinobot4k|mediabox4k"

SRCDATE = "20181030"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u5-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "14129cd4f932373d748f63a52efab72a"
SRC_URI[sha256sum] = "6b6d37a636e4201ad73ef82bd8df36ff4c582019729667f5c5860922c260733b"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
