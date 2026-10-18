package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:t.class */
public final class t {
    public int a;
    public int b;
    public int c = 4;
    public int d = 16;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int[] f427a = new int[64];

    public final void a(int[] r7, int r8) {
        az.a(this.f427a, ((this.a + r8) % this.d) * this.c, r7, 0, this.c);
    }

    public final boolean a(int[] r7) {
        int r0 = (this.b + 1) % this.d;
        if (this.a == r0) {
            return false;
        }
        az.a(r7, 0, this.f427a, this.b * this.c, this.c);
        this.b = r0;
        return true;
    }

    public final int a() {
        return ((this.b - this.a) + this.d) % this.d;
    }

    public final String toString() {
        return super.toString();
    }
}
