SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "dinoboth265|axashistwin"

SRCDATE = "20190620"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/${MACHINETYPE}-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "a9cdd71a0617cbd065dc7a28f9d5a263"
SRC_URI[sha256sum] = "fa9be1fb16b47cb59aac3597cabe3e0cc0c848693f60af3b248320fcde6ed102"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
