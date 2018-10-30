SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "axashis4kcomboplus|dinobot4kplus"

SRCDATE = "20181030"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u52-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "d8eb03fa59b0f21084a9bb620e06053f"
SRC_URI[sha256sum] = "31f6705eee55072201d742d784f1d88a1450b3ada2ad2639da61aa3d03f5fca8"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
