SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "anadol4k|dinobot4k|mediabox4k"

SRCDATE = "20190319"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u5-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "f1d25a38e876b0778f4090220b133dd3"
SRC_URI[sha256sum] = "fbf3107aad5757785530a4385d7a1cc3f4417100446f78924ad2a7852ed1e43f"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
