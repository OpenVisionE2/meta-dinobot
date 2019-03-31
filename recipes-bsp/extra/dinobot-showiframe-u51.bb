SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "axashis4kcombo|dinobot4kl|anadol4kcombo|anadol4kv2"

SRCDATE = "20190319"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u51-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "2b5d7931dbc919d5d7fc3b08656a4e52"
SRC_URI[sha256sum] = "c4a271ec9356935f769d5f0f52ab4859ba080d5985c8c723787326ffa21d2cbc"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
