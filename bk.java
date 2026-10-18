package defpackage;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Image2D;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bk.class */
public final class bk extends bi implements bd {
    private int[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private bg[] f123a;
    private int[] b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private u f124a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private bh[] f125a;

    public bk() {
        new ao();
        this.f123a = new bg[29];
        this.b = new int[28];
        this.f124a = new u(299);
        this.a = av.m57a(2);
        int[] r0 = this.a;
        az.c();
        this.f125a = new bh[299];
    }

    @Override // defpackage.bi
    /* JADX INFO: renamed from: a */
    public final bh mo77a(int r4) {
        return this.f125a[r4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v47, types: [bg] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v26, types: [bg] */
    /* JADX WARN: Type inference failed for: r2v13, types: [bg] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bg] */
    /* JADX WARN: Type inference failed for: r4v3, types: [bg] */
    @Override // defpackage.bi
    public final void a(int r7) {
        ?? r10;
        ?? r11;
        if (this.f124a.m196a(r7)) {
            return;
        }
        this.f124a.a(r7);
        bh bhVar = new bh();
        this.f125a[r7] = bhVar;
        bhVar.a = r7;
        az.a(this.a, 0 + (r7 * 9), bhVar.f106a, 0, 9);
        int r0 = bhVar.f106a[0];
        int[] r1 = this.b;
        r1[r0] = r1[r0] + 1;
        bg bgVar = this.f123a[r0];
        ?? r12 = bgVar;
        if (bgVar != null) {
            if (this.b[r0] <= 1) {
                new StringBuffer().append("Atlas load ref count mismatch: ").append(this.b[r0]).toString();
            }
            az.c();
            r11 = r12;
        } else {
            ?? M59a = av.m59a(6, r0);
            try {
                M59a = new bg(Image.createImage((InputStream) M59a));
                r12 = M59a;
                r10 = r12;
            } catch (IOException unused) {
                M59a.printStackTrace();
                r10 = r12;
            }
            if ((aw.a[av.m61a(2, r7)] & 1) != 0) {
                new StringBuffer().append("Create Image2D atlas: ").append(r0).append(" (from ").append(r7).append(")").toString();
                az.d();
                (r10 == true ? 1 : 0).f101a = new Image2D((r10 == true ? 1 : 0).m74a() ? 100 : 99, (r10 == true ? 1 : 0).f101a);
            }
            this.f123a[r0] = r10 == true ? 1 : 0;
            r11 = r10;
        }
        if (r11 == 0) {
            new StringBuffer().append("No atlas ").append(r0).toString();
        }
        az.c();
        Object objM75a = r11.m75a();
        int r2 = r11.a();
        int r3 = r11.b();
        boolean zM74a = r11.m74a();
        bhVar.f104a = objM75a;
        bhVar.b = r2;
        bhVar.c = r3;
        bhVar.f105a = zM74a;
    }

    @Override // defpackage.bi
    public final void b(int r6) {
        if (this.f124a.m196a(r6)) {
            new StringBuffer().append("TextureImage unload image ").append(r6).toString();
            az.d();
            if (au.f85a != null) {
                au.f85a.f107a[r6] = null;
            }
            this.f124a.b(r6);
            int r0 = this.f125a[r6].f106a[0];
            this.f125a[r6] = null;
            int[] r1 = this.b;
            r1[r0] = r1[r0] - 1;
            if (this.b[r0] > 0) {
                return;
            }
            if (this.b[r0] != 0) {
                new StringBuffer().append("Atlas load ref count mismatch: ").append(this.b[r0]).toString();
            }
            az.c();
            new StringBuffer().append("TextureImage unload atlas ").append(r0).toString();
            az.d();
            this.f123a[r0] = null;
            if (au.f85a != null) {
                au.f85a.a[r0] = null;
            }
        }
    }

    @Override // defpackage.bi
    /* JADX INFO: renamed from: a */
    public final boolean mo76a(int r4) {
        return this.f124a.m196a(r4);
    }

    @Override // defpackage.bi
    /* JADX INFO: renamed from: a */
    public final Object mo78a(int r4) {
        return m81a(r4).m75a();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private bg m81a(int r5) {
        if (r5 >= 299) {
            return this.f123a[r5 - 271];
        }
        return this.f123a[this.f125a[r5].f106a[0]];
    }

    @Override // defpackage.bi
    public final int a(Object obj) {
        bg bgVar = new bg((Image) obj);
        int r8 = 28;
        while (this.f123a[r8] != null) {
            r8++;
        }
        this.f123a[r8] = bgVar;
        return r8 - (-271);
    }

    @Override // defpackage.bi
    /* JADX INFO: renamed from: a */
    public final int mo79a(int r5) {
        return r5 >= 299 ? this.f123a[r5 - 271].a() : this.f125a[r5].f106a[1];
    }

    @Override // defpackage.bi
    /* JADX INFO: renamed from: b */
    public final int mo80b(int r5) {
        return r5 >= 299 ? this.f123a[r5 - 271].b() : this.f125a[r5].f106a[2];
    }

    @Override // defpackage.bi
    public final void a(int r12, int r13, int r14) {
        boolean z = r12 >= 299;
        Image image = (Image) m81a(r12).f101a;
        if (z) {
            au.f76a.drawImage(image, r13, r14, 0);
        } else {
            bh bhVar = this.f125a[r12];
            au.f76a.drawRegion(image, bhVar.f106a[3], bhVar.f106a[4], bhVar.b(), bhVar.c(), 0, r13 + bhVar.f106a[7], r14 + bhVar.f106a[8], 0);
        }
    }

    @Override // defpackage.bi
    public final void a(int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        int r110;
        int r111;
        boolean z = r12 >= 299;
        Image image = (Image) m81a(r12).f101a;
        if (z) {
            au.f76a.drawRegion(image, r16, r17, r18, r19, r15, r13, r14, 0);
            return;
        }
        bh bhVar = this.f125a[r12];
        int r0 = bhVar.f106a[7];
        int r1 = bhVar.f106a[8];
        int r2 = bhVar.b();
        int r3 = bhVar.c();
        int r112 = q.b(r18, (r2 + r0) - r16);
        int r113 = q.b(r19, (r3 + r1) - r17);
        int r4 = r0 - r16;
        if (r4 > 0) {
            r110 = 0;
            r112 -= r4;
            r13 += r4;
        } else {
            r110 = -r4;
        }
        int r5 = r1 - r17;
        if (r5 > 0) {
            r111 = 0;
            r113 -= r5;
            r14 += r5;
        } else {
            r111 = -r5;
        }
        if (r112 <= 0 || r113 <= 0) {
            return;
        }
        au.f76a.drawRegion(image, r110 + bhVar.f106a[3], r111 + bhVar.f106a[4], r112, r113, r15, r13, r14, 0);
    }
}
