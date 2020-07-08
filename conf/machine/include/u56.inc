EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3798mv200"

KERNEL_MODULE_AUTOLOAD += "8192eu"

require conf/machine/include/dinobot-cortexa15.inc
require conf/machine/include/dinobot-emmc.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u56"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-dvb-modules-u56 \
	dinobot-libs-u56 \
	dinobot-hihalt-u56 \
	"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u56"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u56"

MACHINETYPE = "u56"

MTD_KERNEL = "mmcblk0p9"
MTD_ROOTFS = "mmcblk0p10"

SDCARDIMG = "no"

MACHINE_FEATURES += "blindscan-dvbs 7segment textlcd hiaccel"

IMAGEDIR = "axas/axasc4k"
