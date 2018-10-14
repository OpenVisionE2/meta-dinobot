SUMMARY = "helper for dinobot"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PV = "1.0"

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rcS.d
    echo "#!/bin/sh" > ${WORKDIR}/lib-helper.sh
    echo "ln -sf libjpeg9b.so.0.0 /usr/lib/libjpeg.so.62.2.0" >> ${WORKDIR}/lib-helper.sh
    echo "ln -sf libjpeg.so.62.2.0 /usr/lib/libjpeg.so.62" >> ${WORKDIR}/lib-helper.sh
    install -m 0755 ${WORKDIR}/lib-helper.sh ${D}/etc/init.d/lib-helper.sh
    ln -sf ../init.d/lib-helper.sh ${D}${sysconfdir}/rcS.d/S60lib-helper
}
