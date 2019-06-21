SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "anadol4k|dinobot4k|mediabox4k"

SRCDATE = "20190412"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/${MACHINETYPE}-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "560d280ac291a03f6ba8ac75212eefa1"
SRC_URI[sha256sum] = "44dc7494ec1b796ef29d91eff5f0f3eb6f6aa2b5e687c7159db268263342a5dd"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
