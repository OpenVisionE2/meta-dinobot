SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "axashis4kcomboplus|dinobot4kplus"

SRCDATE = "20181115"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u52-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "4d3539f554bb572fe90821bb7b7e6d48"
SRC_URI[sha256sum] = "b67165293812a7207819368e582a2fc359fdeb3181e4d951ce2b07857520b635"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
