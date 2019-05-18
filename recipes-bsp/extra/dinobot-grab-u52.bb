SUMMARY = "grab for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "axashis4kcomboplus|dinobot4kplus"

SRCDATE = "20190516"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "aio-grab"
RREPLACES_${PN}  = "aio-grab"
RCONFLICTS_${PN} = "aio-grab"

SRC_URI = "http://source.mynonpublic.com/dinobot/u52-grab-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "fe1d100930b74c1d4fcd1c8b2d7c09af"
SRC_URI[sha256sum] = "21199b4c6d2bed28847940363bab56a6e4a1a60745ccbfacbf07f9bd177b4e74"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/grab ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/grab"