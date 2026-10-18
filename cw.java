package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cw.class */
public final class cw {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ct f229a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public cy f230a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f231a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f232a = -1.0f;
    public short a = -1;

    public final void a(short s, short s2, short s3, int r8) {
        this.a = s;
        this.f229a = cu.a[s2];
        this.f230a = cz.a[s3];
        this.f231a = r8;
    }

    public final eo a() {
        if (this.f230a.f235a != 0) {
            if (this.f230a.f235a != cy.b) {
                return null;
            }
            el elVar = new el();
            ((eo) elVar).a = this.f230a.f236a;
            return elVar;
        }
        en enVar = new en();
        ap[] apVarArr = new ap[this.f230a.a.length];
        for (int r11 = 0; r11 < apVarArr.length; r11++) {
            apVarArr[r11] = new ap(this.f230a.a[r11].f60a, this.f230a.a[r11].b);
        }
        enVar.a(apVarArr, apVarArr.length);
        return enVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m132a() {
        return this.a >= 55 && this.a <= 59;
    }

    public final boolean b() {
        return this.a == 1;
    }

    public final boolean c() {
        return this.a >= 13 && this.a <= 48;
    }
}
