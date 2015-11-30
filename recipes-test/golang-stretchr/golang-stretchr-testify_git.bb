SUMMARY = "Extensions to the standard go testing package"
HOMEPAGE = "http://godoc.org/github.com/stretchr/testify"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${GO_SRCROOT}/LICENCE.txt;md5=fb69a5b3ab53064d3b92a28289f5a59e"
GO_SRCROOT = "github.com/stretchr/testify"
SRC_URI = "git://${GO_SRCROOT};name=testify \
           git://github.com/stretchr/objx;name=objx;destsuffix=${GO_SRCROOT}/vendor/github.com/stretchr/objx"
SRCREV_testify = "${AUTOREV}"
SRCREV_objx = "${AUTOREV}"
SRCREV_FORMAT = "testify+objx"
PV="1.0+git${SRCPV}"

DEPENDS = "golang-davecgh-go-spew golang-pmezard-go-difflib"

export GO15VENDOREXPERIMENT = "1"

inherit golang
