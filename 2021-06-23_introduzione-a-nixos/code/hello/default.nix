
let
  pkgs = import <nixpkgs> {} ;
in

pkgs.stdenv.mkDerivation rec {
  pname = "hello";
  version = "2.10";

  src = pkgs.fetchurl {
    url = "mirror://gnu/hello/${pname}-${version}.tar.gz";
    sha256 = "0ssi1wpaf7plaswqqjwigppsg5fyh99vdlb9kzl7c9lng89ndq1i";
  };

  buildPhase = "make";
  
  installPhase = "make install";
}

