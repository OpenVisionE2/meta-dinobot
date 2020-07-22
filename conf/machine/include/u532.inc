EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3798cv200"
HICHIPSET = "3798cv200"
CHIPSET = "Hi3798Cv200"

require conf/machine/include/dinobot-cortexa15.inc
require conf/machine/include/dinobot-emmc.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u532"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-dvb-modules-u532 \
	dinobot-libs-u532 \
	dinobot-hihalt-u532 \
	"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u532"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u532"

MACHINETYPE = "u532"

MTD_KERNEL = "mmcblk0p10"
MTD_ROOTFS = "mmcblk0p13"

SDCARDIMG = "no"

MACHINE_FEATURES += "7segment hiaccel"

IMAGEDIR = "e2/update"

STB_PLATFORM = "u532"
