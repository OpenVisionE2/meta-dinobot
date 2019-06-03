EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3716mv410"

KERNEL_MODULE_AUTOLOAD += "8192eu"

require conf/machine/include/dinobot-cortexa9.inc
require conf/machine/include/dinobot-ubi.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u41"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
    dinobot-dvb-modules-u41 \
    dinobot-libs-u41 \
    dinobot-hihalt-u41 \
"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u41"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u41"

MACHINETYPE = "u41"

MTD_KERNEL = "mtd8"
MTD_ROOTFS = "mtd9"

SDCARDIMG = "no"

MACHINE_FEATURES += "blindscan-dvbs textlcd"
