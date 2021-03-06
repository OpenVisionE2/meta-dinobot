SUMMARY = "${MACHINE} partitions files"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"
require conf/license/license-close.inc
PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "${SRCDATE}"

S = "${WORKDIR}"

SRC_URI = "http://source.mynonpublic.com/dinobot/${SOC_FAMILY}-partitions-${SRCDATE}.zip;name=newgeneration \
    file://flash-apploader \
"

SRC_URI_dinobot4kse = "http://source.mynonpublic.com/dinobot/${SOC_FAMILY}-partitions-${SRCDATE}.zip;name=${MACHINE} \
    file://flash-apploader \
"

inherit update-rc.d

INITSCRIPT_NAME = "flash-apploader"
INITSCRIPT_PARAMS = "start 90 S ."

do_configure[nostamp] = "1"

do_install() {
    install -d ${D}${datadir}
    install -m 0644 ${S}/apploader.bin ${D}${datadir}/apploader.bin
    install -m 0755 -d ${D}${INIT_D_DIR}
    install -m 0755 ${WORKDIR}/flash-apploader ${D}${INIT_D_DIR}/flash-apploader
}

FILES_${PN} = "${datadir} ${sysconfdir}"

