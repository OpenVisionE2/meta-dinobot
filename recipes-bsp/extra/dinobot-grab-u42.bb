SUMMARY = "grab for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "anadolprohd5"

SRCDATE = "20190521"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "aio-grab"
RREPLACES_${PN}  = "aio-grab"
RCONFLICTS_${PN} = "aio-grab"

SRC_URI = "http://source.mynonpublic.com/dinobot/u42-grab-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "1a0a214dd0cdab1763b956061269c6cf"
SRC_URI[sha256sum] = "76a14b68d6cf5cb489a689e8a9087a583c24f402ba1c2b535a6a4e44c38f1392"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/grab ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/grab"
