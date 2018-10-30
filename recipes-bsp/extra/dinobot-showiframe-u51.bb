SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "axashis4kcombo|dinobot4kl|anadol4kcombo|anadol4kv2"

SRCDATE = "20181030"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u51-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "75bc8988ea6b13eff09ab25427b0cef4"
SRC_URI[sha256sum] = "88e7ded763c9c17b322052231a23491ffd7f21a561db33c59a63a2b56afed11f"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
