SUMMARY = "grab for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "dinobotu43"

SRCDATE = "20190620"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "aio-grab"
RREPLACES_${PN}  = "aio-grab"
RCONFLICTS_${PN} = "aio-grab"

SRC_URI = "http://source.mynonpublic.com/dinobot/${MACHINETYPE}-grab-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "3d4901fb2ed0516adf74599bdc39fa5e"
SRC_URI[sha256sum] = "8beb533554c316af4da6c736105f4f92dfd654b0ed59cd159077344b3e4690fc"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/grab ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/grab"
