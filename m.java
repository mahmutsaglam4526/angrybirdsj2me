package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:m.class */
public final class m {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Object[] f422a = new Object[4];

    public final Object a() {
        if (this.a == 0) {
            return null;
        }
        Object[] objArr = this.f422a;
        int r2 = this.a - 1;
        this.a = r2;
        Object obj = objArr[r2];
        this.f422a[this.a] = null;
        return obj;
    }

    public final int a(Object obj) {
        if (this.a == this.f422a.length) {
            Object[] objArr = new Object[this.a << 1];
            az.a(this.f422a, 0, objArr, 0, this.a);
            this.f422a = objArr;
        }
        Object[] objArr2 = this.f422a;
        int r2 = this.a;
        this.a = r2 + 1;
        objArr2[r2] = obj;
        return this.a - 1;
    }

    public final void a(int r8, Object obj) {
        if (this.a == this.f422a.length) {
            Object[] objArr = new Object[this.a << 1];
            az.a(this.f422a, 0, objArr, 0, this.a);
            this.f422a = objArr;
        }
        az.a(this.f422a, r8, this.f422a, r8 + 1, this.a - r8);
        this.a++;
        this.f422a[r8] = obj;
    }

    public final Object a(int r8) {
        if (r8 < 0) {
            r8 = this.a + r8;
        }
        Object obj = this.f422a[r8];
        az.a(this.f422a, r8 + 1, this.f422a, r8, (this.a - r8) - 1);
        Object[] objArr = this.f422a;
        int r2 = this.a - 1;
        this.a = r2;
        objArr[r2] = null;
        return obj;
    }

    public final String toString() {
        return super.toString();
    }
}
