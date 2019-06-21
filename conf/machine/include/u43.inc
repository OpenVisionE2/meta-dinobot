EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3716mv410"

KERNEL_MODULE_AUTOLOAD += "8192eu"

require conf/machine/include/dinobot-cortexa9.inc
require conf/machine/include/dinobot-ubi.inc

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
    dinobot-dvb-modules-u43 \
    dinobot-libs-u43 \
    dinobot-hihalt-u43 \
"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u43"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u43"

MACHINETYPE = "u43"

MTD_KERNEL = "mtd8"
MTD_ROOTFS = "mtd11"

SDCARD = "no"

MACHINE_FEATURES += "RCA dvb-c 7segment textlcd"

IMAGEDIR = "dinobot/u43"

