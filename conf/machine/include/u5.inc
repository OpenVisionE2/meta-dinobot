EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3798mv200"
HICHIPSET = "3798mv200"
CHIPSET = "Hi3798Mv200"

KERNEL_MODULE_AUTOLOAD += "8192eu"

require conf/machine/include/dinobot-cortexa15.inc
require conf/machine/include/dinobot-emmc.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u5"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-dvb-modules-u5 \
	dinobot-libs-u5 \
	dinobot-hihalt-u5 \
	"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u5"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u5"

MACHINETYPE = "u5"

MACHINE_FEATURES += "7segment blindscan-dvbs textlcd hiaccel RCA"

IMAGEDIR = "dinobot/u5"

STB_PLATFORM = "u5"

EXTRA_ALSA = "mv200"
