package kaptainwutax.biomeutils;

import kaptainwutax.seedutils.mc.MCVersion;

public class VersionedGen {
    public boolean isDefault1_1=false;
    protected final MCVersion version;
    public final VersionGate is1_6down = () -> this.getVersion().isOlderOrEqualTo(MCVersion.v1_6_4); // everything before  1.7
    public final VersionGate is1_7up = () -> this.getVersion().isNewerOrEqualTo(MCVersion.v1_7_2); // everything after 1.6
    public final VersionGate is1_8up = () -> this.getVersion().isNewerOrEqualTo(MCVersion.v1_8); // everything after 1.7
    public final VersionGate is1_12down = () -> this.getVersion().isOlderOrEqualTo(MCVersion.v1_12_2); // everything before 1.13
    public final VersionGate is1_13up = () -> this.getVersion().isNewerOrEqualTo(MCVersion.v1_13); // everything after 1.12
    public final VersionGate is1_14up = () -> this.getVersion().isNewerOrEqualTo(MCVersion.v1_14); // everything after 1.13

    public VersionedGen(MCVersion version) {this.version = version;}

    public MCVersion getVersion() {
        return this.version;
    }

    public interface VersionGate {
        boolean call();
    }
}
