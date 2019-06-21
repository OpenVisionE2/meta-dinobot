SUMMARY = "grab for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "mediabox4k|dinobot4k|anadol4k"

SRCDATE = "20190412"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "aio-grab"
RREPLACES_${PN}  = "aio-grab"
RCONFLICTS_${PN} = "aio-grab"

SRC_URI = "http://source.mynonpublic.com/dinobot/${MACHINETYPE}-grab-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "58f233ed0cf05313a5a899f61b26965b"
SRC_URI[sha256sum] = "c4a7f4552aa30b52fb28dc2ce7395f6ad4b9b10e12742a3a7e93d0905e206ac9"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/grab ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/grab"
