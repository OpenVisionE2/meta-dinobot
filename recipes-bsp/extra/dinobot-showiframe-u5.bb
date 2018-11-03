SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "anadol4k|dinobot4k|mediabox4k"

SRCDATE = "20181102"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u5-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "c10b2c6cb58795a0acdb9754048420cf"
SRC_URI[sha256sum] = "4f4f7f0bd1c02d6aba4496683334328f4a874baa01fd41719a4862bf123a6adb"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
