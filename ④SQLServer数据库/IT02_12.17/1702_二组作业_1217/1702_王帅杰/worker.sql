USE [db_worker]
GO
/****** Object:  Table [dbo].[tb_worker]    Script Date: 12/17/2017 19:29:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_worker](
	[id] [int] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NULL,
	[dateline] [date] NULL,
	[recommend] [bit] NULL,
	[department] [nvarchar](16) NULL,
	[remarks] [ntext] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Table_workers]    Script Date: 12/17/2017 19:29:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_workers](
	[id] [int] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[salary] [money] NULL,
	[dateline] [date] NULL,
	[recommend] [bit] NULL,
	[department] [nvarchar](50) NULL,
	[remarks] [ntext] NULL,
 CONSTRAINT [PK_Table_workers] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_worker__salar__014935CB]    Script Date: 12/17/2017 19:29:00 ******/
ALTER TABLE [dbo].[tb_worker] ADD  DEFAULT ((3000)) FOR [salary]
GO
