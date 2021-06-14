SUMMARY = "showiframe for ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/${MACHINETYPE}-showiframe-${SRCDATE}.tar.gz"

S = "${WORKDIR}"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/showiframe ${D}${bindir}
	if [ -e ${S}/dinobotplayer ]; then
		install -m 0755 ${S}/dinobotplayer ${D}${bindir}
	fi
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
