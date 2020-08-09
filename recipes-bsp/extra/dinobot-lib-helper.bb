require conf/license/license-gplv2.inc


do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rcS.d
    echo "#!/bin/sh" > ${WORKDIR}/lib-helper.sh
    echo "ln -sf libjpeg9b.so.0.0 ${libdir}/libjpeg.so.62.2.0" >> ${WORKDIR}/lib-helper.sh
    echo "ln -sf libjpeg.so.62.2.0 ${libdir}/libjpeg.so.62" >> ${WORKDIR}/lib-helper.sh
    install -m 0755 ${WORKDIR}/lib-helper.sh ${D}${sysconfdir}/init.d/lib-helper.sh
    ln -sf ../init.d/lib-helper.sh ${D}${sysconfdir}/rcS.d/S99lib-helper
}
