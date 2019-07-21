DESCRIPTION = "Resize Rootfs"
require conf/license/license-gplv2.inc

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "e2fsprogs-resize2fs"

PV = "1.0"

SRC_URI = "file://resizerootfs"

inherit update-rc.d

INITSCRIPT_NAME = "resizerootfs"
INITSCRIPT_PARAMS = "start 7 S ."

do_install () {
    install -m 0755 -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/resizerootfs ${D}${sysconfdir}/init.d/resizerootfs
}

COMPATIBLE_MACHINE = "anadol4k|axashis4kcombo|axashis4kcomboplus|dinobot4k|dinobot4kl|dinobot4kmini|dinobot4kplus|dinobot4kse|mediabox4k|ferguson4k|anadol4kcombo|anadol4kv2|dinobot4kpro|dinobotu55|dinoboth265|axashistwin|axashisc4k|anadolprohd5|dinobotu43|protek4kx1|spycatminiv2|iziboxecohd|jdhdduo|turing|arivacombo|arivatwin"
