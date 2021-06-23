{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = [
    pkgs.adoptopenjdk-hotspot-bin-16
  ];
}
