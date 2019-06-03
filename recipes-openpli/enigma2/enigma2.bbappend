DEPENDS += "\
    ${@bb.utils.contains("MACHINE_FEATURES", "hiaccel", "dinobot-libs-${MACHINETYPE}", "", d)} \
    "

RDEPENDS_${PN} += "\
    ${@bb.utils.contains("MACHINE_FEATURES", "hiaccel", "dinobot-libs-${MACHINETYPE}", "", d)} \
    "
