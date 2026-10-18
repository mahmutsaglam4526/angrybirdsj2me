package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ad.class */
public final class ad {
    public static int a(int r5, int r6, float f) {
        int r2 = (int) (f * 256.0f);
        int r0 = 256 - r2;
        return (((((r5 & 16711935) * r0) + ((r6 & 16711935) * r2)) & (-16711936)) | ((((r5 & 65280) * r0) + ((r6 & 65280) * r2)) & 16711680)) >> 8;
    }

    static {
        int[] r0 = {16711680, 65280, 255, 16711680};
    }
}
