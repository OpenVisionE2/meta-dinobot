EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3716mv410"

KERNEL_MODULE_AUTOLOAD += "8192eu"

require conf/machine/include/dinobot-cortexa9.inc
require conf/machine/include/dinobot-ubi.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u42"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
    dinobot-dvb-modules-u42 \
    dinobot-libs-u42 \
    dinobot-hihalt-u42 \
"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u42"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u42"

MACHINETYPE = "u42"

MTD_KERNEL = "mtd8"
MTD_ROOTFS = "mtd11"

SDCARD = "no"

MACHINE_FEATURES += "RCA blindscan-dvbs"

IMAGEDIR = "dinobot/u42"

