SUMMARY = "grab for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "dinobot4kpro"

SRCDATE = "20190619"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "aio-grab"
RREPLACES_${PN}  = "aio-grab"
RCONFLICTS_${PN} = "aio-grab"

SRC_URI = "http://source.mynonpublic.com/dinobot/u54-grab-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "57c77e6530dc4679e51dc00c5efabe5d"
SRC_URI[sha256sum] = "4cf0cb14d82281080b8bd4c8666099bce1fe16f29286b01d031537d0154c8077"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/grab ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/grab"
