SUMMARY = "showiframe for dinobot Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} = "libjpeg-turbo"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "dinoboth265|axashistwin"

SRCDATE = "20190510"

PV = "${SRCDATE}"

RPROVIDES_${PN}  = "showiframe"
RREPLACES_${PN}  = "showiframe"
RCONFLICTS_${PN} = "showiframe"

SRC_URI = "http://source.mynonpublic.com/dinobot/u41-showiframe-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "748291c24e1a1ef0234c4a105c1e3988"
SRC_URI[sha256sum] = "e4baaf11e3ca6151dbfc0382babc7e7fcefdc74cf8661fb84cd19d4bf50f71f3"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/showiframe"
