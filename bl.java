package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bl.class */
public final class bl {
    public byte[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f126a;
    public int b;

    public bl() {
        this.a = new byte[1];
        this.f126a = this.a.length;
    }

    public bl(byte[] bArr) {
        this.a = bArr;
        this.f126a = this.a.length;
    }

    public final int a() {
        return this.f126a - this.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m82a() {
        this.f126a = this.b;
        this.b = 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final byte m83a() {
        byte[] bArr = this.a;
        int r2 = this.b;
        this.b = r2 + 1;
        return bArr[r2];
    }

    public final void a(int r7) {
        c(this.b + 1);
        byte[] bArr = this.a;
        int r2 = this.b;
        this.b = r2 + 1;
        bArr[r2] = (byte) r7;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m84a() {
        return m83a() != 0;
    }

    public final void a(boolean z) {
        a(z ? 1 : 0);
    }

    public final int b() {
        byte[] bArr = this.a;
        int r2 = this.b;
        this.b = r2 + 1;
        int r0 = (bArr[r2] & 255) << 24;
        byte[] bArr2 = this.a;
        int r3 = this.b;
        this.b = r3 + 1;
        int r1 = r0 | ((bArr2[r3] & 255) << 16);
        byte[] bArr3 = this.a;
        int r4 = this.b;
        this.b = r4 + 1;
        int r5 = r1 | ((bArr3[r4] & 255) << 8);
        byte[] bArr4 = this.a;
        int r6 = this.b;
        this.b = r6 + 1;
        return r5 | (bArr4[r6] & 255);
    }

    public final void b(int r7) {
        c(this.b + 4);
        byte[] bArr = this.a;
        int r2 = this.b;
        this.b = r2 + 1;
        bArr[r2] = (byte) (255 & (r7 >> 24));
        byte[] bArr2 = this.a;
        int r3 = this.b;
        this.b = r3 + 1;
        bArr2[r3] = (byte) (255 & (r7 >> 16));
        byte[] bArr3 = this.a;
        int r4 = this.b;
        this.b = r4 + 1;
        bArr3[r4] = (byte) (255 & (r7 >> 8));
        byte[] bArr4 = this.a;
        int r5 = this.b;
        this.b = r5 + 1;
        bArr4[r5] = (byte) (255 & r7);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final char m85a() {
        byte[] bArr = this.a;
        int r2 = this.b;
        this.b = r2 + 1;
        int r0 = (bArr[r2] & 255) << 8;
        byte[] bArr2 = this.a;
        int r3 = this.b;
        this.b = r3 + 1;
        return (char) (r0 | (bArr2[r3] & 255));
    }

    public final String toString() {
        return super.toString();
    }

    public final void c(int r7) {
        if (this.f126a < r7) {
            this.f126a = r7;
        }
        int length = this.a.length;
        int r8 = length;
        if (length < r7) {
            while (r8 < r7) {
                r8 <<= 1;
            }
            byte[] bArr = new byte[r8];
            az.a(this.a, 0, bArr, 0, this.a.length);
            this.a = bArr;
        }
    }
}
