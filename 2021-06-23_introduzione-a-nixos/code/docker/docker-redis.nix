{ pkgs ? import <nixpkgs> {} }:
pkgs.dockerTools.buildLayeredImage {
    name = "nix-redis";
    tag = "latest";
    contents = [pkgs.redis];
}