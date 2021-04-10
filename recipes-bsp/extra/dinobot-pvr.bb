require conf/license/license-gplv2.inc

do_install() {
    install -d ${D}${INIT_D_DIR}
    install -d ${D}${sysconfdir}/rcS.d
    echo "#!/bin/sh" > ${WORKDIR}/dinobot-pvr.sh
    echo "echo 1 > /proc/stb/parameters/ts_tap" >> ${WORKDIR}/dinobot-pvr.sh
    install -m 0755 ${WORKDIR}/dinobot-pvr.sh ${D}${INIT_D_DIR}/dinobot-pvr.sh
    ln -sf ../init.d/dinobot-pvr.sh ${D}${sysconfdir}/rcS.d/S39dinobot-pvr
}
