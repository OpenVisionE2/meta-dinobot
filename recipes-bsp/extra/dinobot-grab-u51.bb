SUMMARY = "grab for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "axashis4kcombo|dinobot4kl|anadol4kcombo|anadol4kv2"

SRCDATE = "20190516"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "aio-grab"
RREPLACES_${PN}  = "aio-grab"
RCONFLICTS_${PN} = "aio-grab"

SRC_URI = "http://source.mynonpublic.com/dinobot/u51-grab-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "211533fda6454ae05c39a04b41111f66"
SRC_URI[sha256sum] = "2cc50bf294ad9268d277ad656a6b6ffc173b0bd73e4355551b2722f173eb3ee4"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/grab ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/grab"
