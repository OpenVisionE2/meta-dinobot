SUMMARY = "halt for ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "${SRCDATE}"

INITSCRIPT_NAME = "suspend"
INITSCRIPT_PARAMS = "start 89 0 ."
inherit update-rc.d

SRC_URI  = "http://source.mynonpublic.com/dinobot/${MACHINETYPE}-hihalt-${SRCDATE}.tar.gz \
    file://suspend.sh \
"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/hihalt ${D}${bindir}
    install -m 0755 ${S}/hipmoc ${D}${bindir}
    install -m 0755 ${S}/timerTask.py ${D}${bindir}
    install -d ${D}${INIT_D_DIR}
    install -m 0755 ${S}/suspend.sh ${D}${INIT_D_DIR}/suspend
}

do_package_qa() {
}

FILES_${PN}  = "${bindir} ${INIT_D_DIR}"
