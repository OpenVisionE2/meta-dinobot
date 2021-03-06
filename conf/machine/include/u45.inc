EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3716mv410"
HICHIPSET = "3716mv410"
CHIPSET = "Hi3716Mv410"

KERNEL_MODULE_AUTOLOAD += "8192eu"

require conf/machine/include/dinobot-cortexa9.inc
require conf/machine/include/dinobot-ubi.inc

MACHINETYPE = "u45"

MTD_KERNEL = "mtd8"
MTD_ROOTFS = "mtd9"

SDCARD = "no"

MACHINE_FEATURES += "hiaccel blindscan-dvbs 7segmentRCA "

STB_PLATFORM = "${MACHINETYPE}"

RCNAME = "axas4"
RCIDNUM = "1"
