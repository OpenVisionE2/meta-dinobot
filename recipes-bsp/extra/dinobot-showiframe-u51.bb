SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "axashis4kcombo|dinobot4kl|anadol4kcombo|anadol4kv2"

SRCDATE = "20190412"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u51-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "dda237a6d2c59776bc3ad4fe5d31f83f"
SRC_URI[sha256sum] = "0ec73546c093f6e5b94576d961089fc671e87359b03c7f5b23605c2b1c7a249b"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
