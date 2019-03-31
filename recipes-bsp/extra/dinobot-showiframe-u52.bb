SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "axashis4kcomboplus|dinobot4kplus"

SRCDATE = "20190318"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u52-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "7d2cb7c24a4e2ef7105bd87fb4373bae"
SRC_URI[sha256sum] = "29d5c0612982aa6cb4df2f801b5ad9ecff9b889f03928d5c46555b4c006024ae"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
