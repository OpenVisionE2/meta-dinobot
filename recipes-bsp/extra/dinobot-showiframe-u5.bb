SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "anadol4k|dinobot4k|mediabox4k"

SRCDATE = "20181022"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u5-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "b2c18992292f61adab7ac5caa0b1b14c"
SRC_URI[sha256sum] = "7094d336526b169e740c8c893dab13cc9dca1de13c8a9116191e6bdbe16e0aa3"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
